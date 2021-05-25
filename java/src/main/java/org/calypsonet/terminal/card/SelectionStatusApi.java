/* **************************************************************************************
 * Copyright (c) 2018 Calypso Networks Association https://www.calypsonet-asso.org/
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

/**
 * Data elements from the card selection.
 *
 * @since 1.0
 */
public interface SelectionStatusApi {

  /**
   * Gets the power-on sequence data.
   *
   * <p>The power-on sequence data is defined as the data retrieved by the reader when the card is
   * inserted.
   *
   * <p>In the case of a contact reader, this is the Answer To Reset data (ATR) defined by ISO7816.
   *
   * <p>In the case of a contactless reader, the reader decides what this data is. Contactless
   * readers provide a virtual ATR (partially standardized by the PC/SC standard), but other devices
   * can have their own definition, including for example elements from the anti-collision stage of
   * the ISO14443 protocol (ATQA, ATQB, ATS, SAK, etc).
   *
   * @return Null if the power on data is not available.
   * @since 1.0
   */
  byte[] getPowerOnDataBytes();

  /**
   * Gets the {@link ApduResponseApi} from the card to the <b>Selection Application</b> command.
   *
   * @return Null if the FCI is not available.
   * @since 1.0
   */
  ApduResponseApi getFci();

  /**
   * Gives the selection process status.
   *
   * @return True if the card inserted matches the selection.
   * @since 1.0
   */
  boolean hasMatched();
}
