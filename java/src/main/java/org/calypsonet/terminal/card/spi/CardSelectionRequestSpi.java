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
package org.calypsonet.terminal.card.spi;

import org.calypsonet.terminal.card.CardSelectionResponse;

/**
 * Defines the getters of an object carrying the elements on which the card selection process is
 * based.
 *
 * <p>Embeds a card selector defining the target card profile and an optional card request to be
 * executed after the card selection when successful.
 *
 * @see CardSelectionResponse
 * @since 1.0
 */
public interface CardSelectionRequestSpi {

  /**
   * Gets the card selector.
   *
   * @return A not null reference.
   * @since 1.0
   */
  CardSelectorSpi getCardSelector();

  /**
   * Gets the card request.
   *
   * @return a {@link CardRequestSpi} or null if it has not been defined
   * @since 1.0
   */
  CardRequestSpi getCardRequest();
}
