/* **************************************************************************************
 * Copyright (c) 2021 Calypso Networks Association https://calypsonet.org/
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
 * Data to build a single APDU command to be sent to a card.
 *
 * @see org.calypsonet.terminal.card.ApduResponseApi
 * @since 1.0.0
 */
public interface ApduRequestSpi {

  /**
   * Gets the APDU bytes to be sent to the card.
   *
   * @return A array of at least 4 bytes.
   * @since 1.0.0
   */
  byte[] getApdu();

  /**
   * Gets the list of status words that must be considered successful for the APDU.
   *
   * @return A set of integer values containing at least 9000h.
   * @since 1.0.0
   */
  Set<Integer> getSuccessfulStatusWords();

  /**
   * Gets the information about this APDU request (e.g. command name).
   *
   * <p>These information are intended to improve the logging.
   *
   * @return Null if no information has been defined.
   * @since 1.0.0
   */
  String getInfo();
}
