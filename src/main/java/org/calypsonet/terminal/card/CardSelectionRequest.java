/* **************************************************************************************
 * Copyright (c) 2020 Calypso Networks Association https://www.calypsonet-asso.org/
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

import org.calypsonet.terminal.card.spi.CardSelectorSpi;

/**
 * This POJO contains the data used to define a selection case.
 *
 * <p>A selection case is defined by a {@link CardSelectorSpi} that target a particular smart card
 * and an optional {@link CardRequest} containing additional APDU commands to be sent to the card
 * when the selection is successful.
 *
 * <p>One of the uses of this class is to open a logical communication channel with a card in order
 * to continue with other exchanges and carry out a complete transaction.
 *
 * @see CardSelectionResponse
 * @since 1.0
 */
public final class CardSelectionRequest {

  private final CardSelectorSpi cardSelector;
  private final CardRequest cardRequest;

  /**
   * Builds a card selection request to open a logical channel without sending additional APDUs.
   *
   * <p>The cardRequest field is set to null.
   *
   * @param cardSelector The card selector.
   * @since 1.0
   */
  public CardSelectionRequest(CardSelectorSpi cardSelector) {
    this(cardSelector, null);
  }

  /**
   * Builds a card selection request to open a logical channel with additional APDUs to be sent
   * after the selection step.
   *
   * @param cardSelector The card selector.
   * @param cardRequest The card request.
   * @since 1.0
   */
  public CardSelectionRequest(CardSelectorSpi cardSelector, CardRequest cardRequest) {
    this.cardSelector = cardSelector;
    this.cardRequest = cardRequest;
  }

  /**
   * Gets the card selector.
   *
   * @return A not null reference.
   * @since 1.0
   */
  public CardSelectorSpi getCardSelector() {
    return cardSelector;
  }

  /**
   * Gets the card request.
   *
   * @return a {@link CardRequest} or null if it has not been defined
   * @since 1.0
   */
  public CardRequest getCardRequest() {
    return cardRequest;
  }
}
