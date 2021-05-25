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
package org.calypsonet.terminal.card.spi;

import java.util.List;

/**
 * List of {@link ApduRequestSpi} to be sent to a card and a flag indicating whether to stop
 * processing in case of an unexpected status word in response to one of the APDUs.
 *
 * @see org.calypsonet.terminal.card.ApduResponseApi
 * @since 1.0
 */
public interface CardRequestSpi {

  /**
   * Gets the list of {@link ApduRequestSpi}.
   *
   * @return A not empty list.
   * @since 1.0
   */
  List<ApduRequestSpi> getApduRequests();

  /**
   * Indicates if the processing of the requests must stop when an unexpected status word is
   * received.
   *
   * @return True if the process must stop at the first unsuccessful status code received.
   * @since 1.0
   */
  boolean stopOnUnsuccessfulStatusWord();
}
