def call()
{

echo " performing a maven build"
  sh 'ls -lrt'
sh 'mvn clean package'
echo "build is completed"
}
