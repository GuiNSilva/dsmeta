import logo from '../../assets/img/logo.svg'
import './styles.css'



function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="logo da empresa"/>
                    <h1>DSMeta</h1>
                    <h3>Pequeno projeto Full Stack</h3>
                    <p>Desenvolvido por
                        <a href="https://www.instagram.com/guirks/
        ">@guirks</a>
                    </p>
            </div>

        </header>
    )
}

export default Header