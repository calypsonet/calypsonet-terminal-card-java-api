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

/**
 * Card extension API identification.
 *
 * @since 1.0
 */
public interface CardExtensionSpi {

  /**
   * Gets the Card API version used at compile time
   *
   * @return A not empty String
   * @since 1.0
   */
  String getCardApiVersion();

  /**
   * Gets the Service API version used at compile time
   *
   * @return A not empty String
   * @since 1.0
   */
  String getServiceApiVersion();

  /**
   * Gets the Commons API version used at compile time
   *
   * @return A not empty String
   * @since 1.0
   */
  String getCommonsApiVersion();
}
