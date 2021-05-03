USE [master]
GO
/****** Object:  Database [web_person_creditcard_tracker]    Script Date: 4/4/2021 2:10:20 PM ******/
CREATE DATABASE [web_ban_kinh_n13]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'hb_web_ban_kinh_n13', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\hb_web_ban_kinh_n13.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'hb_web_ban_kinh_n13_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\hb_web_ban_kinh_n13_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [web_ban_kinh_n13] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [web_ban_kinh_n13].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [web_ban_kinh_n13] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET ARITHABORT OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [web_ban_kinh_n13] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [web_ban_kinh_n13] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [web_ban_kinh_n13] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET  DISABLE_BROKER 
GO
ALTER DATABASE [web_ban_kinh_n13] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [web_ban_kinh_n13] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET RECOVERY FULL 
GO
ALTER DATABASE [web_ban_kinh_n13] SET  MULTI_USER 
GO
ALTER DATABASE [web_ban_kinh_n13] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [web_ban_kinh_n13] SET DB_CHAINING OFF 
GO
ALTER DATABASE [web_ban_kinh_n13] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [web_ban_kinh_n13] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
EXEC sys.sp_db_vardecimal_storage_format N'web_ban_kinh_n13', N'ON'
GO
USE [web_ban_kinh_n13]
GO
/****** Object:  Table [dbo].[Glass] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Glass](
	[gID] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](255) NOT NULL,
	[type] [varchar](255) NOT NULL,
	[price] [float] NOT NULL, 
	[productDetails] [nvarchar](max) NULL,
	[urlImg] [varchar](255) NULL
PRIMARY KEY CLUSTERED 
(
	[gID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[User] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Users](
	[uID] [int] IDENTITY(1,1) NOT NULL,
	[first_name] [nvarchar](255) NOT NULL,
	[last_name] [nvarchar](255) NOT NULL,
	[email] [nvarchar](255) NOT NULL,
	[phone_num] [nvarchar](255) NOT NULL,
	[address] [nvarchar](255) NOT NULL,
	[url_avatar] [varchar](255) NULL
PRIMARY KEY CLUSTERED 
(
	[uID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Account] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Accounts](
	[uID] [int] IDENTITY(1,1) NOT NULL,
	[email] [nvarchar](255) NOT NULL,
	[pass] [nvarchar](255) NOT NULL,
	[role] [nvarchar](255) NOT NULL
PRIMARY KEY CLUSTERED 
(
	[uID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Bills] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Bills](
	[bID] [int] IDENTITY(1,1) NOT NULL,
	[uID] [int] NOT NULL,
	[date] [DATETIME] DEFAULT GETDATE()
PRIMARY KEY CLUSTERED 
(
	[bID] ASC,
	[uID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[invoiceDetails] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[invoiceDetails](
	[iID] [int] IDENTITY(1,1) NOT NULL,
	[bID] [int] NOT NULL, 
	[gID] [int] NOT NULL,
	[quantity] [int] NOT NULL
PRIMARY KEY CLUSTERED 
(	
	[iID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** INSERT DATA ******/
GO
SET IDENTITY_INSERT [dbo].[Users] ON 
GO
INSERT [dbo].[Users] ([uID], [first_name], [last_name], [email], [phone_num], [address], [url_avatar]) VALUES (1, N'Ngọc', N'Nguyễn', N'ngocnguyen@gmail.com', N'0339778881', N'Vũng Tàu', N'')
GO
SET IDENTITY_INSERT [dbo].[Users] OFF
GO
SET IDENTITY_INSERT [dbo].[Accounts] ON 
GO
INSERT [dbo].[Accounts] ([uID], [email], [pass], [role]) VALUES (1, N'ngocnguyen@gmail.com', N'@dmin', N'ADMIN')
GO
SET IDENTITY_INSERT [dbo].[Accounts] OFF
GO
/****** FOREIGN KEY ******/
ALTER TABLE [dbo].[Accounts]  WITH CHECK ADD  CONSTRAINT [Accounts_uID] FOREIGN KEY ([uID])
REFERENCES [dbo].[Users] ([uID])  
GO
ALTER TABLE [dbo].[Bills]  WITH CHECK ADD  CONSTRAINT [Bills_uID] FOREIGN KEY ([uID])
REFERENCES [dbo].[Users] ([uID])
GO
ALTER TABLE [dbo].[invoiceDetails]  WITH CHECK ADD  CONSTRAINT [invoiceDetails_gID] FOREIGN KEY ([gID])
REFERENCES [dbo].[Glass] ([gID])
GO
ALTER TABLE [dbo].[invoiceDetails]  WITH CHECK ADD  CONSTRAINT [invoiceDetails_bID] FOREIGN KEY ([bID])
REFERENCES [dbo].[Bills] ([bID])
/****** User list ******/
GO
Select * from [Users] JOIN [Accounts] ON [Users].[uID] = [Accounts].[uID]
GO
USE [master]
GO
ALTER DATABASE [web_ban_kinh_n13] SET  READ_WRITE 
GO

