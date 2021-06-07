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
 * Data from the start-up phase with the card: selection data and any additional responses.
 *
 * <p>Includes the status of the selection itself and the responses to any commands that may have
 * been executed afterwards.
 *
 * @see org.calypsonet.terminal.card.spi.CardSelectionRequestSpi
 * @since 1.0
 */
public interface CardSelectionResponseApi {

  /**
   * Gets the card power-on data.
   *
   * @return Null if the card power-on data is not available.
   * @since 1.0
   */
  String getPowerOnData();

  /**
   * Gets the {@link ApduResponseApi} received from the card in response to the <b>Select
   * Application</b> command.
   *
   * @return Null if no Select Application command was performed..
   * @since 1.0
   */
  ApduResponseApi getSelectApplicationResponse();

  /**
   * Gives the selection process status.
   *
   * @return True if the card inserted matches the selection filters.
   * @since 1.0
   */
  boolean hasMatched();

  /**
   * Gets the responses of the card to the requests present in the {@link
   * org.calypsonet.terminal.card.spi.CardRequestSpi} from the {@link
   * org.calypsonet.terminal.card.spi.CardSelectionRequestSpi}.
   *
   * @return Null if no requests have been set.
   * @since 1.0
   */
  CardResponseApi getCardResponse();
}
