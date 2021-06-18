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
package org.calypsonet.terminal.card;

/**
 * Generic exception carrying response data received from the card until a communication failure
 * occurs or an unexpected APDU status word is received.
 *
 * @since 1.0
 */
public class AbstractApduException extends Exception {

  private final CardResponseApi cardResponseApi;
  private final boolean isCardResponseComplete;

  /**
   * Builds a new exception embedding card response data.
   *
   * @param cardResponseApi The card responses received so far.
   * @param isCardResponseComplete True if the number responses equals the number of requests
   *     present in the original {@link org.calypsonet.terminal.card.spi.CardRequestSpi}.
   * @param message the message to identify the exception context
   * @since 1.0
   */
  public AbstractApduException(
      CardResponseApi cardResponseApi, boolean isCardResponseComplete, String message) {
    super(message);
    this.cardResponseApi = cardResponseApi;
    this.isCardResponseComplete = isCardResponseComplete;
  }

  /**
   * Builds a new exception embedding card response data with the originating exception.
   *
   * @param cardResponseApi The card responses received so far.
   * @param isCardResponseComplete True if the number responses equals the number of requests
   *     present in the original {@link org.calypsonet.terminal.card.spi.CardRequestSpi}.
   * @param message Message to identify the exception context.
   * @param cause The cause
   * @since 1.0
   */
  public AbstractApduException(
      CardResponseApi cardResponseApi,
      boolean isCardResponseComplete,
      String message,
      Throwable cause) {
    super(message, cause);
    this.cardResponseApi = cardResponseApi;
    this.isCardResponseComplete = isCardResponseComplete;
  }

  /**
   * Gets the response data received so far.
   *
   * @return A not null reference.
   * @since 1.0
   */
  public CardResponseApi getCardResponse() {
    return cardResponseApi;
  }

  /**
   * Indicates if all the responses expected from the corresponding {@link
   * org.calypsonet.terminal.card.spi.CardRequestSpi} have been received.
   *
   * @return True if all expected responses have been received.
   * @since 1.0
   */
  boolean isCardResponseComplete() {
    return isCardResponseComplete;
  }
}
