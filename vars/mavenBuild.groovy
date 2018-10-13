def call()
{

echo " performing a maven build"
sh 'mvn clean package'
echo "build is completed"
}
