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

/**
 * This POJO contains the data from a card obtained in response to a card selection request.
 *
 * <p>These data are the selection status ({@link SelectionStatus}) and the responses, if any, to
 * the additional APDUs sent to the card ({@link CardResponse}).
 *
 * @see CardSelectionRequest
 * @since 1.0
 */
public final class CardSelectionResponse {

  private final SelectionStatus selectionStatus;
  private final CardResponse cardResponse;

  /**
   * Builds a card selection response from the {@link SelectionStatus} and a {@link CardResponse}
   * (list of {@link ApduResponse}).
   *
   * @param selectionStatus The selection status.
   * @param cardResponse null if no card response is available.
   * @since 1.0
   */
  public CardSelectionResponse(SelectionStatus selectionStatus, CardResponse cardResponse) {

    this.selectionStatus = selectionStatus;
    this.cardResponse = cardResponse;
  }

  /**
   * Gets the selection status.
   *
   * @return A not null reference.
   * @since 1.0
   */
  public SelectionStatus getSelectionStatus() {
    return this.selectionStatus;
  }

  /**
   * Gets the card response.
   *
   * @return null if no responses have been set.
   * @since 1.0
   */
  public CardResponse getCardResponse() {
    return cardResponse;
  }
}
