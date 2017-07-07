package com.atsistemas.batch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

import com.atsistemas.batch.model.Charge;

public class ChargeItemProcessor implements ItemProcessor<Charge, Charge> {

    private static final Logger log = LoggerFactory.getLogger(ChargeItemProcessor.class);

    @Override
    public Charge process(final Charge charge) throws Exception {
        final String firstName = charge.getApe_nom_razon_social().toUpperCase();
        final String lastName = charge.getEmail().toUpperCase();

        return charge;
    }

}
