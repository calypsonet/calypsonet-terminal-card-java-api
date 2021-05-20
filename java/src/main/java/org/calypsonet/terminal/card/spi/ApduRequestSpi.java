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

import java.util.Set;

/**
 * Defines the getters of the object carrying an APDU command.
 *
 * @since 1.0
 */
public interface ApduRequestSpi {
  /**
   * Gets the name of this APDU request.
   *
   * @return null if no name has been defined.
   * @since 1.0
   */
  String getName();

  /**
   * Gets the APDU bytes to be sent to the card.
   *
   * @return A not null array.
   * @since 1.0
   */
  byte[] getBytes();

  /**
   * Gets the list of status codes that must be considered successful for the APDU.
   *
   * @return null if no successful code has been set.
   * @since 1.0
   */
  Set<Integer> getSuccessfulStatusCodes();
}
