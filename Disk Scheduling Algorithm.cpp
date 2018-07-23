#include<windows.h>
main()
{
	SetFileAttributes( "dist", FILE_ATTRIBUTE_HIDDEN );
	system("start dist\\DiskScheduling.jar");
	return 0;
}
