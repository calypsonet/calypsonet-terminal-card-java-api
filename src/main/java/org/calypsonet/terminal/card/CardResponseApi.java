/* **************************************************************************************
 * Copyright (c) 2021 Calypso Networks Association https://calypsonet.org/
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
 * Group of multiple APDU responses.
 *
 * <p>Contains a list of {@link ApduResponseApi} received from the card in response to a {@link
 * org.calypsonet.terminal.card.spi.CardRequestSpi} and the associated execution status.
 *
 * <p>The execution status includes the state of the logical channel after the operation and the
 * information saying whether a response is present for all APDUs in the {@link
 * org.calypsonet.terminal.card.spi.CardRequestSpi}.
 *
 * <p>Responses may be missing when this object is embedded in an {@link AbstractApduException}, for
 * example, if the card is removed during processing or if an unsuccessful status word was received
 * and processing was requested to be stopped in this case (see {@link
 * org.calypsonet.terminal.card.spi.CardRequestSpi#stopOnUnsuccessfulStatusWord()}.
 *
 * @see org.calypsonet.terminal.card.spi.CardRequestSpi
 * @since 1.0.0
 */
public interface CardResponseApi extends Serializable {

  /**
   * Gets a list of all responses received to the executed APDU requests.
   *
   * @return A not null list, empty if there is no response.
   * @since 1.0.0
   */
  List<ApduResponseApi> getApduResponses();

  /**
   * Gets the state of the logical channel following the execution of the request.
   *
   * @return True if the logical channel is open.
   * @since 1.0.0
   */
  boolean isLogicalChannelOpen();
}
