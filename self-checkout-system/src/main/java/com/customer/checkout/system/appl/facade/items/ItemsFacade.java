package com.customer.checkout.system.appl.facade.items;

import com.customer.checkout.system.appl.model.items.Items;

import java.util.List;

public interface ItemsFacade {
    List<Items> getAllItems();

    boolean getItemsById(String itemId);
}
