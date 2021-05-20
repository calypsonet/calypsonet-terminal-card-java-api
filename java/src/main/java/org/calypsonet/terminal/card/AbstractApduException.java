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

/**
 * Generic exception carrying response data received from the card until a communication failure
 * occurs or an unexpected APDU status code is received.
 *
 * @since 1.0
 */
public class AbstractApduException extends Exception {

  private final CardResponse cardResponse;

  /**
   * Builds a new exception embedding card response data.
   *
   * @param cardResponse The card responses received so far.
   * @param message the message to identify the exception context
   * @since 1.0
   */
  public AbstractApduException(CardResponse cardResponse, String message) {
    super(message);
    this.cardResponse = cardResponse;
  }

  /**
   * Builds a new exception embedding card response data with the originating exception.
   *
   * @param cardResponse The card responses received so far.
   * @param message Message to identify the exception context.
   * @param cause The cause
   * @since 1.0
   */
  public AbstractApduException(CardResponse cardResponse, String message, Throwable cause) {
    super(message, cause);
    this.cardResponse = cardResponse;
  }

  /**
   * Gets the response data received so far.
   *
   * @return A not null reference.
   * @since 1.0
   */
  public CardResponse getCardResponse() {
    return cardResponse;
  }
}
