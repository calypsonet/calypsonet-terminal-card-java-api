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
 * Exception carrying response data received from the card until an unexpected APDU status word is
 * received.
 *
 * @since 1.0
 */
public class UnexpectedStatusWordException extends AbstractApduException {

  /**
   * Builds a new exception embedding card response data.
   *
   * @param cardResponseApi The card responses received so far.
   * @param isCardResponseComplete True if the number responses equals the number of requests
   *     present in the original {@link org.calypsonet.terminal.card.spi.CardRequestSpi}.
   * @param message Message to identify the exception context.
   * @since 1.0
   */
  public UnexpectedStatusWordException(
      CardResponseApi cardResponseApi, boolean isCardResponseComplete, String message) {
    super(cardResponseApi, isCardResponseComplete, message);
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
  public UnexpectedStatusWordException(
      CardResponseApi cardResponseApi,
      boolean isCardResponseComplete,
      String message,
      Throwable cause) {
    super(cardResponseApi, isCardResponseComplete, message, cause);
  }
}
