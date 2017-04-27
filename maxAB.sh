#Tim max bang dong lenh
#	find max value	
#	file maxAB.sh
#	from: ./maxAB.sh a b

clear
if test $1 -gt $2
then
   echo "SLN giua 2 so $1 va $2 la: $1"
else
   if test $1 -eq $2
	then
	  echo "Hai so $1 va $2 bang nhau"
	else
	  echo "So lon nhat giua 2 so $1 va $2 la: $2"
	fi
fi	