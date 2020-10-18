create table AccountDetail(acno int(10) references SavingAccountDetail(accno),
remarks varchar(500))