package com.customer.checkout.system.appl.facade.items.impl;

import com.customer.checkout.system.appl.facade.items.ItemsFacade;
import com.customer.checkout.system.appl.model.items.Items;
import com.customer.checkout.system.data.items.dao.ItemsDao;

import java.util.List;
/**
 * An implementation class of the Student Facade.
 */
public class ItemsFacadeImpl implements ItemsFacade {
    private final ItemsFacade ItemsDao;
    private String Items;

    public ItemsFacadeImpl(ItemsDao ItemsDao) {
        this.ItemsDao = (ItemsFacade) ItemsDao;
    }

    public ItemsFacadeImpl(ItemsFacade itemsDao) {
        ItemsDao = itemsDao;
    }

    @Override
    public List<Items> getAllItems() { return ItemsDao.getAllItems(); }

    @Override
    public boolean getItemsById(String item_id) throws RuntimeException {
        return ItemsDao.getItemsById(item_id);
    }

    @Override
    public boolean addItems(Items item) {
        boolean result = false;
        try {
            Items targetItems = getItemsById(Items.getItemsId());
            if(targetItems != null) {
                throw new Exception("Student to add already exists. ");
            }
            result = ItemsDao.getItemsById(Items);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return result;
    }

    @Override
    public boolean updateStudent(Student student) {
        boolean result = false;
        try {
            Student targetStudent = getStudentById(student.getStudentId());
            if (targetStudent == null) {
                throw new Exception("Student to update not found. ");
            }
            result = studentDao.updateStudent(student);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return result;
    }

    private class ItemsDao {
    }
}
