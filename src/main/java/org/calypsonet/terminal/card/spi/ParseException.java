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
package org.calypsonet.terminal.card.spi;

/**
 * Indicates that the parsing of the card selection response has card failed.
 *
 * <p>The most likely reason is that the select application command returned an invalid FCI
 * structure.
 *
 * @since 1.0.0
 */
public class ParseException extends Exception {

  /**
   * @param message The message to identify the exception context.
   * @since 1.0.0
   */
  public ParseException(String message) {
    super(message);
  }

  /**
   * @param message The message to identify the exception context.
   * @param cause The cause.
   * @since 1.0.0
   */
  public ParseException(String message, Throwable cause) {
    super(message, cause);
  }
}
