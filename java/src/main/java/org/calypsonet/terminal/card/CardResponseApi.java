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

import java.io.Serializable;
import java.util.List;

/**
 * List of {@link ApduResponseApi} received from the card and associated execution information.
 *
 * @see org.calypsonet.terminal.card.spi.CardRequestSpi
 * @since 1.0
 */
public interface CardResponseApi extends Serializable {

  /**
   * Gets a list of all responses received to all APDU requests executed when {@link #isComplete()}
   * returns true, otherwise the first responses received.
   *
   * @return A not null list, but empty if there is no response.
   * @since 1.0
   */
  List<ApduResponseApi> getApduResponses();

  /**
   * Gets the logical channel status.
   *
   * @return True if the logical channel is open.
   * @since 1.0
   */
  boolean isLogicalChannelOpen();

  /**
   * Indicates if all the responses expected from the corresponding {@link
   * org.calypsonet.terminal.card.spi.CardRequestSpi} have been received.
   *
   * @return True if all expected responses have been received.
   * @since 1.0
   */
  boolean isComplete();
}
