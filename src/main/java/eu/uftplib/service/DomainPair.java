// SPDX-FileCopyrightText: 2020-2021 Alliander N.V.
//
// SPDX-License-Identifier: Apache-2.0

package eu.uftplib.service;

public class DomainPair {
    private String SenderDomain;
    private String RecipientDomain;

    public DomainPair(String senderDomain, String recipientDomain) {
        this.SenderDomain = senderDomain;
        this.RecipientDomain = recipientDomain;
    }

    public String getSenderDomain() {
        return this.SenderDomain;
    }

    public String getRecipientDomain() {
        return this.RecipientDomain;
    }
}