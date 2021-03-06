/*
 *  Copyright 2017 DTCC, Fujitsu Australia Software Technology, IBM - All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 	  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.hyperledger.fabric.sdk.transaction;

import org.hyperledger.fabric.protos.peer.Chaincode;
import org.hyperledger.fabric.protos.peer.FabricProposal;
import org.hyperledger.fabric.sdk.exception.ProposalException;

import static org.hyperledger.fabric.protos.peer.Chaincode.ChaincodeSpec.Type.GOLANG;


public class LCCCProposalBuilder extends ProposalBuilder {
    private static final String LCCC_CHAIN_NAME = "lccc";
    private static final Chaincode.ChaincodeID CHAINCODE_ID_LCCC =
            Chaincode.ChaincodeID.newBuilder().setName(LCCC_CHAIN_NAME).build();

    @Override
    public LCCCProposalBuilder context(TransactionContext context) {
        super.context(context);
        return this;
    }

    @Override
    public FabricProposal.Proposal build() throws ProposalException {

        ccType(GOLANG);
        chaincodeID(CHAINCODE_ID_LCCC);

        return super.build();

    }
}
