/* **************************************************************************************
 * Copyright (c) 2021 Calypso Networks Association https://www.calypsonet-asso.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License 2.0 which is available at http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ************************************************************************************** */
package org.calypsonet.terminal.card.spi;

import java.util.Set;

/**
 * Data elements for filtering cards and selecting applications.
 *
 * <p>These elements are of three kinds:
 *
 * <ul>
 *   <li>The <b>card protocol</b>, corresponding to the underlying technology: ISO14443-A,
 *       ISO14443-B or any other proprietary or standardized communication technology.
 *   <li>The <b>power-on data</b> pattern.
 *   <li>The <b>selection of the application</b> as defined by ISO7816-4.
 * </ul>
 *
 * These filter elements offered in the card selector, are all optional but can also be combined.
 * <br>
 * If no filtering is specified, any card that responds when inserted in the reader will be
 * considered selected. <br>
 * Conversely, if one or more filters have been defined, the card will not be selected if one of
 * them rejects the card.<br>
 * For the selection by the card protocol, we assume that the reader access layer has provided
 * constants in the form of strings defining the supported protocols. <br>
 * Similarly, for power-on data selection, it is assumed that the reader access layer has provided
 * the structure of the returned data or rules for interpreting it in the form of regular
 * expressions. <br>
 * The selection by DF Name is governed by standardized elements such as the AID and the different
 * values of FileOccurrence, FileControlInformation.
 *
 * @since 1.0
 */
public interface CardSelectorSpi {

  /**
   * Gets the card protocol name.
   *
   * @return Null if no card protocol has been set.
   * @since 1.0
   */
  String getCardProtocol();

  /**
   * Gets the regular expression to be applied to the card's power-on data.
   *
   * @return Null if no power-on data regex has been set.
   * @since 1.0
   */
  String getPowerOnDataRegex();

  /**
   * Gets the ISO7816-4 Application Identifier (AID).
   *
   * @return Null if no AID has been set.
   * @since 1.0
   */
  byte[] getAid();

  /**
   * Gets the {@link FileOccurrence} parameter defining the navigation within the card applications
   * list.
   *
   * @return A not null reference.
   * @since 1.0
   */
  FileOccurrence getFileOccurrence();

  /**
   * Gets the {@link FileControlInformation} parameter defining the output type of the select
   * command.
   *
   * @return A not null reference.
   * @since 1.0
   */
  FileControlInformation getFileControlInformation();

  /**
   * Gets the list of successful selection status words.
   *
   * @return A set of integer values containing at least 9000h.
   * @since 1.0
   */
  Set<Integer> getSuccessfulSelectionStatusWords();

  /**
   * Navigation options through the different applications contained in the card according to the
   * ISO7816-4 standard.
   *
   * @since 1.0
   */
  enum FileOccurrence {
    /**
     * First occurrence.
     *
     * @since 1.0
     */
    FIRST,
    /**
     * Last occurrence.
     *
     * @since 1.0
     */
    LAST,
    /**
     * Next occurrence.
     *
     * @since 1.0
     */
    NEXT,
    /**
     * Previous occurrence.
     *
     * @since 1.0
     */
    PREVIOUS
  }

  /**
   * Types of templates available in return for the Select Application command, according to the
   * ISO7816-4 standard.
   *
   * @since 1.0
   */
  enum FileControlInformation {
    /**
     * File control information.
     *
     * @since 1.0
     */
    FCI,
    /**
     * File control parameters.
     *
     * @since 1.0
     */
    FCP,
    /**
     * File management data.
     *
     * @since 1.0
     */
    FMD,
    /**
     * No response expected.
     *
     * @since 1.0
     */
    NO_RESPONSE
  }
}
