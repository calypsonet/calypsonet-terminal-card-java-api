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

import java.util.HashSet;
import java.util.Set;

/**
 * This POJO contains a set of data related to an ISO-7816 APDU command.
 *
 * <ul>
 *   <li>A byte array containing the raw APDU data.
 *   <li>A flag indicating if the APDU is of type 4 (ingoing and outgoing data).
 *   <li>An optional set of integers corresponding to valid status codes in response to this APDU.
 * </ul>
 *
 * Attaching an optional name to the request facilitates the enhancement of the application logs.
 *
 * @since 1.0
 */
public final class ApduRequest {

  private static final int DEFAULT_SUCCESSFUL_CODE = 0x9000;

  private final byte[] bytes;
  private final Set<Integer> successfulStatusCodes;
  private String name;

  /**
   * Builds an APDU request from a raw byte buffer.
   *
   * <p>The default status codes list is initialized with the standard successful code 9000h.
   *
   * @param bytes The bytes of the APDU's body.
   * @since 1.0
   */
  public ApduRequest(byte[] bytes) {
    this.bytes = bytes;
    this.successfulStatusCodes = new HashSet<Integer>();
    this.successfulStatusCodes.add(DEFAULT_SUCCESSFUL_CODE);
  }

  /**
   * Adds a status code to the list of those that should be considered successful for the APDU.
   *
   * <p>Note: initially, the list contains the standard successful status code {@code 9000h}.
   *
   * @param successfulStatusCode A positive int &le; {@code FFFFh}.
   * @return the object instance.
   * @since 1.0
   */
  public ApduRequest addSuccessfulStatusCode(int successfulStatusCode) {
    this.successfulStatusCodes.add(successfulStatusCode);
    return this;
  }

  /**
   * Gets the list of status codes that must be considered successful for the APDU.
   *
   * @return null if no successful code has been set.
   * @since 1.0
   */
  public Set<Integer> getSuccessfulStatusCodes() {
    return successfulStatusCodes;
  }

  /**
   * Names the APDU request.
   *
   * <p>This string is dedicated to improve the readability of logs and should therefore only be
   * invoked conditionally (e.g. when log level &gt;= debug).
   *
   * @param name The request name (free text).
   * @return The object instance.
   * @since 1.0
   */
  public ApduRequest setName(final String name) {
    this.name = name;
    return this;
  }

  /**
   * Gets the name of this APDU request.
   *
   * @return null if no name has been defined.
   * @since 1.0
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the APDU bytes to be sent to the card.
   *
   * @return A not null array.
   * @since 1.0
   */
  public byte[] getBytes() {
    return this.bytes;
  }
}
