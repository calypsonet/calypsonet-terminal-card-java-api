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
package org.calypsonet.terminal.card;

import java.io.Serializable;

/**
 * Data received in response to an APDU command.
 *
 * @see org.calypsonet.terminal.card.spi.ApduRequestSpi
 * @since 1.0
 */
public interface ApduResponseApi extends Serializable {

  /**
   * Gets the raw data received from the card (including the SW1SW2 status word).
   *
   * @return A not null byte array.
   * @since 1.0
   */
  byte[] getBytes();

  /**
   * Gets the data part of the response received from the card (excluding the SW1SW2 status word).
   *
   * @return A not null byte array.
   * @since 1.0
   */
  byte[] getDataOut();

  /**
   * Gets the SW1SW2 status word of the APDU as an int.
   *
   * @return A int.
   * @since 1.0
   */
  int getStatusWord();
}
