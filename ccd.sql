Create database ccd;
use ccd;
DROP TABLE IF EXISTS citas;
CREATE TABLE IF NOT EXISTS citas (
  idcita int(11) NOT NULL,
  idpaciente int(11) NOT NULL,
  idespecialista int(11) NOT NULL,
  fecha date NOT NULL,
  Hora date NOT NULL,
  estado varchar(255) NOT NULL,
  PRIMARY KEY (idcita),
  KEY `idpaciente` (idpaciente),
  KEY `idespecialista` (idespecialista)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialista`
--

DROP TABLE IF EXISTS especialista;
CREATE TABLE IF NOT EXISTS especialista (
  idespecialista int(11) NOT NULL,
  idpaciente int(11) NOT NULL,
  nombre varchar(255) NOT NULL,
  apellido varchar(255) NOT NULL,
  direccion varchar(255) NOT NULL,
  ciudad varchar(255) NOT NULL,
  pais varchar(255) NOT NULL,
  telefono varchar(255) NOT NULL,
  edad int(11) NOT NULL,
  PRIMARY KEY (idespecialista),
  KEY `idpaciente` (idpaciente)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

DROP TABLE IF EXISTS login;
CREATE TABLE IF NOT EXISTS login (
  idlogin int(11) NOT NULL,
  idpaciente int(11) NOT NULL,
  usuario varchar(255) NOT NULL,
  contraseña varchar(255) NOT NULL,
  type varchar(255) NOT NULL,
  PRIMARY KEY (idlogin),
  KEY idpaciente (idpaciente)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

DROP TABLE IF EXISTS paciente;
CREATE TABLE IF NOT EXISTS paciente (
  idpaciente int(11) NOT NULL,
  nombre varchar(255) NOT NULL,
  apellido varchar(255) NOT NULL,
  direccion varchar(255) NOT NULL,
  ciudad varchar(255) NOT NULL,
  pais varchar(255) NOT NULL,
  telefono varchar(255) NOT NULL,
  edad int(11) NOT NULL,
  PRIMARY KEY (idpaciente)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `citas_ibfk_1` FOREIGN KEY (`idpaciente`) REFERENCES `paciente` (`idpaciente`),
  ADD CONSTRAINT `citas_ibfk_2` FOREIGN KEY (`idespecialista`) REFERENCES `especialista` (`idespecialista`);

--
-- Filtros para la tabla `especialista`
--
ALTER TABLE `especialista`
  ADD CONSTRAINT `especialista_ibfk_1` FOREIGN KEY (`idpaciente`) REFERENCES `paciente` (`idpaciente`);

--
-- Filtros para la tabla `login`
--
ALTER TABLE `login`
  ADD CONSTRAINT `login_ibfk_1` FOREIGN KEY (`idpaciente`) REFERENCES `paciente` (`idpaciente`);
COMMIT;


