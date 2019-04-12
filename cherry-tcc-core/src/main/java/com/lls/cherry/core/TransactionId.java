package com.lls.cherry.core;

import com.lls.cherry.util.ByteUtils;

import javax.transaction.xa.Xid;
import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;

/************************************
 * TransactionId
 * @author liliangshan
 * @date 2019-04-11
 ************************************/
public class TransactionId implements Xid, Serializable {

    private static final long serialVersionUID = 289483894123883L;

    private byte[] globalTransactionId;
    private byte[] branchQualifier;

    public TransactionId() {
        globalTransactionId = ByteUtils.uuidToBytes(UUID.randomUUID());
        branchQualifier = ByteUtils.uuidToBytes(UUID.randomUUID());
    }

    public TransactionId(byte[] globalTransactionId) {
        this.globalTransactionId = globalTransactionId;
    }

    public TransactionId(byte[] globalTransactionId, byte[] branchQualifier) {
        this.globalTransactionId = globalTransactionId;
        this.branchQualifier = branchQualifier;
    }

    public void setGlobalTransactionId(byte[] globalTransactionId) {
        this.globalTransactionId = globalTransactionId;
    }

    public void setBranchQualifier(byte[] branchQualifier) {
        this.branchQualifier = branchQualifier;
    }

    @Override
    public int getFormatId() {
        return 1;
    }

    @Override
    public byte[] getGlobalTransactionId() {
        return globalTransactionId;
    }

    @Override
    public byte[] getBranchQualifier() {
        return branchQualifier;
    }

    public TransactionId copy() {
        byte[] newTransactionId = null;
        byte[] newBranchQualifier = null;

        if (globalTransactionId != null) {
            newTransactionId = new byte[globalTransactionId.length];
            System.arraycopy(globalTransactionId, 0, newTransactionId, 0, globalTransactionId.length);
        }

        if (branchQualifier != null) {
            newBranchQualifier = new byte[branchQualifier.length];
            System.arraycopy(branchQualifier, 0, newBranchQualifier, 0, branchQualifier.length);
        }

        return new TransactionId(newTransactionId, newBranchQualifier);
    }

    @Override
    public String toString() {
        return UUID.nameUUIDFromBytes(globalTransactionId).toString() +
                ":" + UUID.nameUUIDFromBytes(branchQualifier).toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.getFormatId();
        result = prime * result + Arrays.hashCode(globalTransactionId);
        result = prime * result + Arrays.hashCode(branchQualifier);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        TransactionId other = (TransactionId) obj;
        if (this.getFormatId() != other.getFormatId()) {
            return false;
        }
        if (!Arrays.equals(branchQualifier, other.branchQualifier)) {
            return false;
        }

        return Arrays.equals(globalTransactionId, other.globalTransactionId);
    }
}
