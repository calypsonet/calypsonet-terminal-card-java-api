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
 * Defines the getters of an object carrying a set of {@link ApduRequestSpi} to sent to a card.
 *
 * <p>Also allows to give information about the possible stop of the processing of {@link
 * ApduRequestSpi} in case of unexpected status word.
 *
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
   * Gets the status code verification policy.
   *
   * @return true if the status code verification is enabled, false if not.
   * @since 1.0
   */
  boolean isStatusCodeVerificationEnabled();
}
