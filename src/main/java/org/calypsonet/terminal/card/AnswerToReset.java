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
 * This POJO contains the data retrieved from the card after the power on sequence.
 *
 * <p>In the case of an ISO-7816 card (with contacts), these data are the ATR (Answer To Reset)
 * bytes as defined by the standard.<br>
 * However, in the case of another type of card, this data may be specific to the card reader (e.g.
 * reconstructed ATR for a PC/SC reader, low-level protocol information for other card readers,
 * etc).
 *
 * @since 1.0
 */
public class AnswerToReset {
  private final byte[] bytes;

  /**
   * Constructor.
   *
   * @param bytes The power on sequence data bytes.
   * @since 1.0
   */
  public AnswerToReset(byte[] bytes) {
    this.bytes = bytes;
  }

  /**
   * Gets an array of bytes containing the power on sequence data
   *
   * @return A not null byte array.
   * @since 1.0
   */
  public byte[] getBytes() {
    return bytes;
  }
}
