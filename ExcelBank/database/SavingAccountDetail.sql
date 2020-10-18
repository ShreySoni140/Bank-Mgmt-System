create table SavingAccountDetail(CIFNO int(10) references Customer_Master,
accno int(10),
minBal int(5),
currBal int(10))
