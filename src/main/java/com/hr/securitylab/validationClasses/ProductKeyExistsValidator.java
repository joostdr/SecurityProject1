package com.hr.securitylab.validationClasses;

import com.hr.securitylab.database.models.DBFactory;
import com.hr.securitylab.annotations.ProductKeyExists;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProductKeyExistsValidator implements ConstraintValidator<ProductKeyExists, String>
{
    @Override
    public void initialize(ProductKeyExists constraintAnnotation)
    {

    }

    @Override
    public boolean isValid(String productKey, ConstraintValidatorContext context)
    {
        return DBFactory.getProductService().checkForExitingProductKey(productKey);
    }
}
