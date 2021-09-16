#!/bin/sh

echo "Computing the version..."

version=$1

if [ "$version" = "" ]
then
  version="`grep "^version" gradle.properties | cut -d= -f2 | tr -d "[:space:]"`-SNAPSHOT"
fi

echo "Computed version: $version"

repository_name=`git rev-parse --show-toplevel | xargs basename`
echo $repository_name

echo "Cloning $repository_name..."
git clone https://github.com/calypsonet/$repository_name.git

cd $repository_name

echo "Checkouting gh-pages branch..."
git checkout -f gh-pages

echo "Deleting existing SNAPSHOT directory..."
rm -rf *-SNAPSHOT

echo "Creating target directories $version/api..."
mkdir -p $version/api

echo "Copying javadoc and home page files..."
cp -rf ../build/docs/javadoc/* $version/api/
cp -rf ../src/main/javadoc/home/* $version/

echo "Updating versions list..."
rm list_versions.md

for directory in `ls -rd */ | cut -f1 -d'/'`
do 
  echo "* [$directory]($directory)" >> list_versions.md
done

echo "Existing versions:"
cat list_versions.md

cd ..

echo "Local docs update finished."



