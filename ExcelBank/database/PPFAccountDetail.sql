create table PPFAccountDetail(CIFNO int(10) references Customer_Master,
accno int(10),
PPFBal int(5),
currBal int(10))