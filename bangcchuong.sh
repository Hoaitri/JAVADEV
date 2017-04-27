#In ra man hinh cac so le tu 1->N
# N nhap tu ban phim

clear
echo -n "Nhap 1 so tu ban phim N= "
read N
  for((i=1; [i<=$N]; [i=$(expr$i+2)])
  do
    echo -n "$i"
  done
    echo -e "/n"

clear
echo -n "Nhap 1 so tu ban phim N= "
read N
  for((i=1;i<=$N;i=$(expr$i+1))
  do	if [$(expr $i %2)-eq 1]
    then
	echo -n "$i"
  fi
    done echo -e "/n"