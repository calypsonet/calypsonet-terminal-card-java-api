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

/**
 * Defines the getters of an object carrying the elements resulting of the card selection.
 *
 * @since 1.0
 */
public interface SelectionStatus {

  /**
   * Gets the power on sequence data.
   *
   * @return null the power on data is not available.
   * @since 1.0
   */
  byte[] getPowerOnDataBytes();

  /**
   * Gets the {@link ApduResponse} from the card to the <b>Selection Application</b> command.
   *
   * @return null if the FCI is not available.
   * @since 1.0
   */
  ApduResponse getFci();

  /**
   * Gives the selection process status.
   *
   * @return true if the card has matched the selection.
   * @since 1.0
   */
  boolean hasMatched();
}
