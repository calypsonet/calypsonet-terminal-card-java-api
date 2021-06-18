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

/**
 * Policy for managing the physical channel after a card request is executed.
 *
 * @since 1.0
 */
public enum ChannelControl {

  /**
   * Leaves the physical channel open.
   *
   * @since 1.0
   */
  KEEP_OPEN,

  /**
   * Terminates communication with the card.<br>
   * The physical channel closes instantly or a card removal sequence is initiated depending on the
   * observation mode.
   *
   * @since 1.0
   */
  CLOSE_AFTER
}
