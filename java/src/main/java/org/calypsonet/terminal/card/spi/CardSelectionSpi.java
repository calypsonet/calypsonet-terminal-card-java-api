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

import org.calypsonet.terminal.card.CardSelectionResponseApi;

/**
 * Extension to the selection service that provides the {@link CardSelectionRequestSpi} and
 * interprets the result to provide a {@link SmartCardSpi}.
 *
 * <p>Counterpart of the <b>org.calypsonet.terminal.reader.selection.CardSelection</b> interface
 * present in the <b>Terminal Reader API</b>.
 *
 * <p>An adapter of this interface must also implement <b>CardSelection</b>.
 *
 * @since 1.0
 */
public interface CardSelectionSpi {

  /**
   * Gets the card selection request containing the selection data prepared for this selection.
   *
   * @return A not null reference.
   * @since 1.0
   */
  CardSelectionRequestSpi getCardSelectionRequest();

  /**
   * Analyzes the response obtained from the card by the selection process and create a {@link
   * SmartCardSpi}.
   *
   * @param cardSelectionResponseApi The card selection response.
   * @return A not null reference.
   * @since 1.0
   */
  SmartCardSpi parse(CardSelectionResponseApi cardSelectionResponseApi);
}
