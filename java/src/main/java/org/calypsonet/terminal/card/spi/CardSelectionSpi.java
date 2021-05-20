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
package org.calypsonet.terminal.card.spi;

import org.calypsonet.terminal.card.CardSelectionResponse;

/**
 * Provides a selection request for a specific card and a method to analyze its result.
 *
 * @since 1.0
 */
public interface CardSelectionSpi {

  /**
   * Gets the card selection request containing the selection data prepared for this selection.
   *
   * @return A not null reference
   * @since 1.0
   */
  CardSelectionRequestSpi getCardSelectionRequest();

  /**
   * Analyzes the response obtained from the card by the selection process and create a specific
   * SmartCard.
   *
   * @param cardSelectionResponse the card selection response
   * @return A not null reference
   * @since 1.0
   */
  SmartCardSpi parse(CardSelectionResponse cardSelectionResponse);
}
