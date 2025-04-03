package com.udea.bancoudea.mapper;

import com.udea.bancoudea.DTO.TransactionDTO;
import com.udea.bancoudea.entity.Transaction;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-29T00:16:03-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public TransactionDTO toDTO(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }

        TransactionDTO transactionDTO = new TransactionDTO();

        transactionDTO.setId( transaction.getId() );
        transactionDTO.setSenderAccountNumber( transaction.getSenderAccountNumber() );
        transactionDTO.setReceiverAccountNumber( transaction.getReceiverAccountNumber() );
        transactionDTO.setAmount( transaction.getAmount() );
        transactionDTO.setTimestamp( transaction.getTimestamp() );

        return transactionDTO;
    }
}
