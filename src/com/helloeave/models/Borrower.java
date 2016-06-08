package com.helloeave.models;

import java.util.Date;
import java.util.List;

import com.helloeave.models.account.Account;

public class Borrower {

	private int id;
	private String surname;
	private String firstName;
	private String middleName;
	private String generationCode;
	private String socialSecurityNumber;
	private Date dateOfBirth;
	private String telephoneNumber;
	private List<Account> accounts;
}
