namespace LojaNinja.Repositorio.EF.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class Initial : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.Permissao",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Nome = c.String(),
                    })
                .PrimaryKey(t => t.Id);
            
            CreateTable(
                "dbo.Usuario",
                c => new
                    {
                        id = c.Int(nullable: false, identity: true),
                        Email = c.String(),
                        Senha = c.String(),
                        Nome = c.String(),
                    })
                .PrimaryKey(t => t.id);
            
            CreateTable(
                "dbo.UsuarioPermissao",
                c => new
                    {
                        Usuario_id = c.Int(nullable: false),
                        Permissao_Id = c.Int(nullable: false),
                    })
                .PrimaryKey(t => new { t.Usuario_id, t.Permissao_Id })
                .ForeignKey("dbo.Usuario", t => t.Usuario_id, cascadeDelete: true)
                .ForeignKey("dbo.Permissao", t => t.Permissao_Id, cascadeDelete: true)
                .Index(t => t.Usuario_id)
                .Index(t => t.Permissao_Id);
            
        }
        
        public override void Down()
        {
            DropForeignKey("dbo.UsuarioPermissao", "Permissao_Id", "dbo.Permissao");
            DropForeignKey("dbo.UsuarioPermissao", "Usuario_id", "dbo.Usuario");
            DropIndex("dbo.UsuarioPermissao", new[] { "Permissao_Id" });
            DropIndex("dbo.UsuarioPermissao", new[] { "Usuario_id" });
            DropTable("dbo.UsuarioPermissao");
            DropTable("dbo.Usuario");
            DropTable("dbo.Permissao");
        }
    }
}
