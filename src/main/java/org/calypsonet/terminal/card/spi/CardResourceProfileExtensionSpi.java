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

import org.calypsonet.terminal.card.ProxyReader;

/**
 * Provides means to check if a reader contains a card that matches a given profile.
 *
 * @since 1.0
 */
public interface CardResourceProfileExtensionSpi {

  /**
   * Checks if a card is inserted in the provided reader, selects it, evaluates its profile and
   * potentially executes any necessary commands.
   *
   * @param reader The reader in which the card is supposed to be inserted.
   * @return A {@link SmartCardSpi} or null if no card is inserted or if its profile does not match
   *     the associated data.
   * @since 1.0
   */
  SmartCardSpi matches(ProxyReader reader);
}
