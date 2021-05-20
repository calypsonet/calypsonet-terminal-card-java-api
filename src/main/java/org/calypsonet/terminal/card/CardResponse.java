/* **************************************************************************************
 * Copyright (c) 2018 Calypso Networks Association https://www.calypsonet-asso.org/
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
 * This POJO contains an ordered list of the responses received following a card request and
 * indicators related to the status of the channel and the completion of the card request.
 *
 * @see CardRequest
 * @since 1.0
 */
public final class CardResponse implements Serializable {

  private final List<ApduResponse> apduResponses;
  private final boolean isLogicalChannelOpen;
  private final boolean isComplete;

  /**
   * Builds a card response from all {@link ApduResponse} received from the card and booleans
   * indicating if the logical channel is still open and if all expected responses have been
   * received.
   *
   * @param apduResponses A not null list.
   * @param isLogicalChannelOpen true if the logical channel is open, false if not.
   * @param isComplete true if all responses have been received, false if not
   * @since 1.0
   */
  public CardResponse(
      List<ApduResponse> apduResponses, boolean isLogicalChannelOpen, boolean isComplete) {

    this.apduResponses = apduResponses;
    this.isLogicalChannelOpen = isLogicalChannelOpen;
    this.isComplete = isComplete;
  }

  /**
   * Gets the APDU responses list.
   *
   * @return A list.
   * @since 1.0
   */
  public List<ApduResponse> getApduResponses() {
    return apduResponses;
  }

  /**
   * Gets the logical channel status
   *
   * @return true if the logical channel is open, false if not.
   * @since 1.0
   */
  public boolean isLogicalChannelOpen() {
    return isLogicalChannelOpen;
  }

  /**
   * Indicates if all the responses expected from the corresponding {@link CardRequest} have been
   * received.
   *
   * @return true if all expected responses have been received, false if not.
   * @since 1.0
   */
  public boolean isComplete() {
    return isComplete;
  }
}
