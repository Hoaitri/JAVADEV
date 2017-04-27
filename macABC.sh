#file maxABC.sh
#./maxABC.sh 2 13 7
#out SLN la: 13

m=$1
if [$m-lt $2]
  then
    m=$2
  fi
if [$m-lt $3]
  then
  m=$3
 fi
  echo "SLN la: $m"
