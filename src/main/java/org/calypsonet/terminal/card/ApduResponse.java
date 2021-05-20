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

import java.io.Serializable;
import java.util.Arrays;

/**
 * This POJO contains a set of data related to an ISO-7816 APDU response.
 *
 * @since 1.0
 */
public final class ApduResponse implements Serializable {

  private final byte[] bytes;
  private final int statusCode;

  /**
   * Builds an APDU response from an array of bytes from the card, computes the status code.
   *
   * @param bytes A byte array
   * @since 1.0
   */
  public ApduResponse(byte[] bytes) {
    this.bytes = bytes;
    statusCode =
        ((bytes[bytes.length - 2] & 0x000000FF) << 8) + (bytes[bytes.length - 1] & 0x000000FF);
  }

  /**
   * Gets the status code SW1SW2 of the APDU.
   *
   * @return A int.
   * @since 1.0
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * Gets the raw data received from the card (including SW1SW2).
   *
   * @return A not null byte array.
   * @since 1.0
   */
  public byte[] getBytes() {
    return this.bytes;
  }

  /**
   * Gets the data part received from the card response (excluding SW1SW2).
   *
   * @return A not null byte array.
   * @since 1.0
   */
  public byte[] getDataOut() {
    return Arrays.copyOfRange(this.bytes, 0, this.bytes.length - 2);
  }
}
