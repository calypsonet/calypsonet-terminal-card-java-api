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
 * Data to build and manage an APDU command to be sent to a card.
 *
 * @see org.calypsonet.terminal.card.ApduResponseApi
 * @since 1.0
 */
public interface ApduRequestSpi {

  /**
   * Gets the name of this APDU request.
   *
   * @return Null if no name has been defined.
   * @since 1.0
   */
  String getName();

  /**
   * Gets the APDU bytes to be sent to the card.
   *
   * @return A array of at least 4 bytes.
   * @since 1.0
   */
  byte[] getBytes();

  /**
   * Gets the list of status words that must be considered successful for the APDU.
   *
   * @return An not empty Set containing at least 9000h.
   * @since 1.0
   */
  Set<Integer> getSuccessfulStatusWords();
}
