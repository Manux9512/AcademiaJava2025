package com.academy.proyecto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.academy.proyecto.models.MembershipBean;


public class MembershipProcessor implements ItemProcessor<MembershipBean, MembershipBean> {

    private Logger LOGGER = LoggerFactory.getLogger(MembershipProcessor.class);

    // Take the input MembershipBean and add a prefix $
    @Override
    public MembershipBean process(final MembershipBean member) throws Exception {
        String cost = "$" + member.getCost();
        
        MembershipBean transformedProduct = new MembershipBean(
        		member.getMemberId(), 
        		member.getFullName(), 
        		member.getEmail(), 
        		member.getSubscriptionTier(),
        		cost);
        
        LOGGER.info("Converting ( {} ) into ( {} )", member, transformedProduct);
        return transformedProduct;
    }
}
