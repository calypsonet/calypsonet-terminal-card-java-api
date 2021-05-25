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

import org.calypsonet.terminal.card.spi.CardRequestSpi;

/**
 * Reader able to transmit card requests and having control over the physical channel, backside of
 * the <b>org.calypsonet.terminal.reader.CardReader</b> interface present in the <b>Terminal Reader
 * API</b>.
 *
 * <p>An adapter of this interface must also implement <b>CardReader</b>.
 *
 * <p>To use this API, you just need to cast a <b>CardReader</b> as a <b>ProxyReaderApi</b>.
 *
 * @since 1.0
 */
public interface ProxyReaderApi {

  /**
   * Transmits a {@link CardRequestSpi}, applies the provided {@link ChannelControl} policy and
   * returns a {@link CardResponseApi}.
   *
   * <p>The APDUs ({@link org.calypsonet.terminal.card.spi.ApduRequestSpi}) contained in the {@link
   * CardRequestSpi} are sent to the card, their responses ({@link ApduResponseApi}) are added to a
   * new list.
   *
   * <p><b>Note:</b> in case of a communication error when sending an APDU, an {@link
   * AbstractApduException} exception is thrown. Any responses from previously transmitted APDU
   * commands are attached to this exception.<br>
   * This allows the calling application to be tolerant to card tearing and to retrieve the partial
   * response to the {@link CardRequestSpi}.
   *
   * @param cardRequest The card request.
   * @param channelControl The channel control policy to apply.
   * @return A not null reference.
   * @throws ReaderBrokenCommunicationException If the communication with the reader has failed.
   * @throws CardBrokenCommunicationException If the communication with the card has failed.
   * @throws UnexpectedStatusWordException If any of the APDUs returned an unexpected status word
   *     and the card request specified the need to check them.
   * @since 1.0
   */
  CardResponseApi transmitCardRequest(CardRequestSpi cardRequest, ChannelControl channelControl)
      throws ReaderBrokenCommunicationException, CardBrokenCommunicationException,
          UnexpectedStatusWordException;

  /**
   * Releases the communication channel previously established with the card.
   *
   * @throws ReaderBrokenCommunicationException If the communication with the reader has failed.
   * @since 1.0
   */
  void releaseChannel() throws ReaderBrokenCommunicationException;
}
