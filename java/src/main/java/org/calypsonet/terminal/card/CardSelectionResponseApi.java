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
 * Data received as a result of the entire selection process, including the result of the selection
 * itself and the responses to any commands that may have been executed afterwards.
 *
 * @see org.calypsonet.terminal.card.spi.CardSelectionRequestSpi
 * @since 1.0
 */
public interface CardSelectionResponseApi {

  /**
   * Gets the selection status.
   *
   * @return A not null reference.
   * @since 1.0
   */
  SelectionStatusApi getSelectionStatus();

  /**
   * Gets the card response.
   *
   * @return null if no responses have been set.
   * @since 1.0
   */
  CardResponseApi getCardResponse();
}
