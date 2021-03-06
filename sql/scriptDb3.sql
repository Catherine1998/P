USE [HOTEL]
GO
SET IDENTITY_INSERT [dbo].[HUESPED] ON 

INSERT [dbo].[HUESPED] ([Id_huesped], [Nombre], [Apellido], [Direccion]) VALUES (2, N'name', N'last name', N'dir')
INSERT [dbo].[HUESPED] ([Id_huesped], [Nombre], [Apellido], [Direccion]) VALUES (4, N'alexander', N'hamilton', N'NY')
INSERT [dbo].[HUESPED] ([Id_huesped], [Nombre], [Apellido], [Direccion]) VALUES (7, N'halo', N'reach', N'segunda direccion')
SET IDENTITY_INSERT [dbo].[HUESPED] OFF
SET IDENTITY_INSERT [dbo].[REGISTRO] ON 

INSERT [dbo].[REGISTRO] ([Id_registro], [Id_huesped], [Fecha_hora_reserva], [Fecha_hora_iniregistro], [Fecha_hora_finregistro], [Fecha_hora_pago], [Total_pago]) VALUES (1, 2, CAST(N'2018-11-01T23:54:37.7500000' AS DateTime2), CAST(N'2018-11-01T00:00:00.0000000' AS DateTime2), CAST(N'2018-10-31T00:00:00.0000000' AS DateTime2), CAST(N'2018-11-01T23:54:37.7500000' AS DateTime2), 0)
SET IDENTITY_INSERT [dbo].[REGISTRO] OFF
SET IDENTITY_INSERT [dbo].[TIPO] ON 

INSERT [dbo].[TIPO] ([Id_tipo], [Descripcion]) VALUES (1, N'VIP')
INSERT [dbo].[TIPO] ([Id_tipo], [Descripcion]) VALUES (2, N'Individual')
INSERT [dbo].[TIPO] ([Id_tipo], [Descripcion]) VALUES (3, N'Doble de uso individual')
INSERT [dbo].[TIPO] ([Id_tipo], [Descripcion]) VALUES (4, N'Habitación doble')
INSERT [dbo].[TIPO] ([Id_tipo], [Descripcion]) VALUES (5, N'Con cama supletoria')
INSERT [dbo].[TIPO] ([Id_tipo], [Descripcion]) VALUES (6, N'Habitación triple - Simple')
INSERT [dbo].[TIPO] ([Id_tipo], [Descripcion]) VALUES (7, N'Junior Suites')
INSERT [dbo].[TIPO] ([Id_tipo], [Descripcion]) VALUES (8, N'Suites')
INSERT [dbo].[TIPO] ([Id_tipo], [Descripcion]) VALUES (9, N'Suite nupcial')
SET IDENTITY_INSERT [dbo].[TIPO] OFF
SET IDENTITY_INSERT [dbo].[HABITACION] ON 

INSERT [dbo].[HABITACION] ([Id_habitacion], [Id_tipo], [Nivel], [Comentario], [Precio], [Estado]) VALUES (2, 8, 4, N'HABITACION 0', 2400, 0)
INSERT [dbo].[HABITACION] ([Id_habitacion], [Id_tipo], [Nivel], [Comentario], [Precio], [Estado]) VALUES (3, 4, 5, N'HABITACION 1', 2037, 0)
INSERT [dbo].[HABITACION] ([Id_habitacion], [Id_tipo], [Nivel], [Comentario], [Precio], [Estado]) VALUES (4, 8, 16, N'HABITACION 2', 6011, 0)
INSERT [dbo].[HABITACION] ([Id_habitacion], [Id_tipo], [Nivel], [Comentario], [Precio], [Estado]) VALUES (5, 4, 2, N'HABITACION 3', 2117, 0)
INSERT [dbo].[HABITACION] ([Id_habitacion], [Id_tipo], [Nivel], [Comentario], [Precio], [Estado]) VALUES (6, 8, 5, N'HABITACION 4', 8923, 0)
INSERT [dbo].[HABITACION] ([Id_habitacion], [Id_tipo], [Nivel], [Comentario], [Precio], [Estado]) VALUES (7, 5, 19, N'HABITACION 5', 8511, 0)
INSERT [dbo].[HABITACION] ([Id_habitacion], [Id_tipo], [Nivel], [Comentario], [Precio], [Estado]) VALUES (8, 7, 17, N'HABITACION 6', 9739, 0)
INSERT [dbo].[HABITACION] ([Id_habitacion], [Id_tipo], [Nivel], [Comentario], [Precio], [Estado]) VALUES (9, 7, 17, N'HABITACION 7', 6918, 0)
INSERT [dbo].[HABITACION] ([Id_habitacion], [Id_tipo], [Nivel], [Comentario], [Precio], [Estado]) VALUES (10, 2, 17, N'HABITACION 8', 8866, 0)
INSERT [dbo].[HABITACION] ([Id_habitacion], [Id_tipo], [Nivel], [Comentario], [Precio], [Estado]) VALUES (11, 6, 13, N'HABITACION 9', 9574, 0)
SET IDENTITY_INSERT [dbo].[HABITACION] OFF
SET IDENTITY_INSERT [dbo].[ASIGNACION] ON 

INSERT [dbo].[ASIGNACION] ([Id_asignacion], [Id_registro], [Id_habitacion], [Id_huesped]) VALUES (1, 1, 2, 2)
SET IDENTITY_INSERT [dbo].[ASIGNACION] OFF
SET IDENTITY_INSERT [dbo].[SERVICIO] ON 

INSERT [dbo].[SERVICIO] ([Id_servicio], [Descripcion], [Precio]) VALUES (1, N'Prueba', 12)
INSERT [dbo].[SERVICIO] ([Id_servicio], [Descripcion], [Precio]) VALUES (2, N'Tarifa de llamadas entre semana por minuto', 0.7)
INSERT [dbo].[SERVICIO] ([Id_servicio], [Descripcion], [Precio]) VALUES (5, N'Tarifa de llamadas entre semana fuera de horario por minuto', 0.9)
INSERT [dbo].[SERVICIO] ([Id_servicio], [Descripcion], [Precio]) VALUES (6, N'Tarifa de llamadas en fines de semana y feriados por minuto', 1.1)
INSERT [dbo].[SERVICIO] ([Id_servicio], [Descripcion], [Precio]) VALUES (7, N'nombre', 12)
INSERT [dbo].[SERVICIO] ([Id_servicio], [Descripcion], [Precio]) VALUES (8, N'cena', 45)
INSERT [dbo].[SERVICIO] ([Id_servicio], [Descripcion], [Precio]) VALUES (9, N'des', 12)
INSERT [dbo].[SERVICIO] ([Id_servicio], [Descripcion], [Precio]) VALUES (10, N'9', 1.1)
SET IDENTITY_INSERT [dbo].[SERVICIO] OFF
