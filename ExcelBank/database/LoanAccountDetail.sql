create table LoanAccountDetail(CIFNO int(10) references Customer_Master,
accno int(10),
Amt int(10),
month int(10),
per float(3,2),
EMI int(10),
TotalAmtPayed int(20))